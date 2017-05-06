mainApp.controller('ProductDetailsCtrl',['$scope','$filter','$uibModal','GetAllProductService','PlaceOredrService',function($scope,$filter,$uibModal,GetAllProductService,PlaceOredrService) {
	console.log('ProductDetailsCtrl is called');
	$scope.allData=[];
	$scope.addConstantForDisplyImg='data:image/JPEG;base64,';
	
	GetAllProductService.getAllProducts().then(
			function(d){
				console.log(d);
				$scope.allData=d.GETALLPRODUCT;
			},
			function(errresponse) {
				});
	
	/*pagignation control page*/
	 $scope.currentPage = 0;
	    $scope.pageSize = 12;
	    $scope.data = [];
	    $scope.q = '';
	    
	    $scope.getData = function () {
	      return $filter('filter')($scope.allData, $scope.q)
	     
	    };
	    
	    $scope.numberOfPages=function(){
	        return Math.ceil($scope.getData().length/$scope.pageSize);                
	    };
	    
	
	    $scope.quantities = [1,2,3,4,5];
	    $scope.selectedQty=1;
	    $scope.unitammount=4;
	    var chooseItem={userId:JSON.parse(window.sessionStorage.getItem('loggedInUserId')).LOGGEDINUSER.id,userName:JSON.parse(window.sessionStorage.getItem('loggedInUserId')).LOGGEDINUSER.userName,selectedItem:[],deliveryAddress:'',contactNumber:'',orderStatus:'',paymentStatus:'',paymentMode:''};
	    $scope.checkBoxValue;
	    
	    //Create arrary to get details of iteams user selection
	    $scope.getValue=function(singleProductDetail,totalAmmount,totalQty,event){
	    	
	    	if(event.checkBoxValue==true){
	    	chooseItem.selectedItem.push({'productId':singleProductDetail.id,
	    	'productName':singleProductDetail.productName,
	    	'quantity':totalQty,'totalAmount':totalAmmount});
	    	}
	    	else{
	    		//var index=chooseItem.selectedItem.indexOf(selectedItem);
	    		console.log('length of===');
	    		//console.log(index);
	    		console.log(chooseItem.selectedItem.length)
	    		for(var i=0;i<chooseItem.selectedItem.length;i++){
	    			if(chooseItem.selectedItem[i].ProductId==singleProductDetail.id){
	    				chooseItem.selectedItem.splice(i,1);
	    			}
	    		}
	    	}
	    	// here set order status
	    	chooseItem.orderStatus=1;
	    	console.log(chooseItem);
	    }
	    
	    
	    
	    /*Below code is written for Dialog box*/
	    
	    $scope.open = function() {
	    	
	    	var modalInstance = $uibModal.open({
	    	templateUrl: 'static/pages/adderNPayment.html',
	    	controller:'AddresNPaymntCtrl'
	    	});
	    	modalInstance.result.then(function(deliveryAdd) {
		        //$scope.scopeData = selectedItem;
		        console.log("In parent class="+deliveryAdd.contacNumber);
		        chooseItem.contactNumber=deliveryAdd.contacNumber;
		        chooseItem.deliveryAddress =deliveryAdd.deliveryAddress;
		        chooseItem.paymentMode=deliveryAdd.paymentMode;
		        if(deliveryAdd.paymentMode==1){
	        		chooseItem.paymentStatus=1;
	        	}
		        else {
		        	chooseItem.paymentStatus=2;
		        }
		        var converArrayToJSon= JSON.stringify(chooseItem.selectedItem)
		        chooseItem.selectedItem=JSON.parse(converArrayToJSon);
		        PlaceOredrService.setOrderDetails(chooseItem).then(function(data){
		        	console.log('Sucess');
		        	
		        },
		        	function(errorResponse)	{
		        	console.log('Error');
		        }
		        );
		       // console.log(contactNumb)
		        console.log(chooseItem);
		        
		      }, function() {
		       console.log("error");
		      });
	    	
	    	
	    	/*$scope.$on('addressNContact', function(event, data)
	    			{ console.log("In Parents "+data); 
	    			});*/
	    	}
	    
	    /**/
}]);





mainApp.filter('startFrom', function() {
    return function(input, start) {
        start = +start; //parse to int
        return input.slice(start);
    }
});
