mainApp.controller('AddNewProductCtrl',['$scope','addProductService',function($scope,addProductService) {
	console.log("add new product ");
	$scope.addNewProductDetails={userId:'',productName:'',price:'',productImg:''};
	var file;
	var handleFileSelect = function(evt) {
		 file = evt.currentTarget.files[0];
		var reader = new FileReader();
		reader.onload = function(evt) {
			$scope.$apply(function($scope) {
				$scope.myImage = evt.target.result;
				//FileUplodeService.uploadProfileImg(file);
			});
		};

		reader.readAsDataURL(file);

	};
	angular.element(document.querySelector('#fileInput')).on('change',
			handleFileSelect);
	
	
	
	
	
	$scope.newProduct=function(){
		var userId = JSON.parse(window.sessionStorage.getItem('loggedInUserId')).LOGGEDINUSER.id;
		
		$scope.addNewProductDetails.userId=userId;
		addProductService.addProduct($scope.addNewProductDetails,file);
	}
}])