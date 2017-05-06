mainApp.controller('AddresNPaymntCtrl',['$scope','$uibModalInstance',function($scope,$uibModalInstance) {
	console.log("hallo AddresNPaymntCtrl");
	$scope.user={deliveryAddress:'',contacNumber:'',paymentMode:''};
	
	
	/*var paymentModearr=[];
	
	$scope.paymentModearr = [{paymentMode:'Case on Delivery',paymentValue:'1'},{paymentMode:'On Line Payment',paymentValue:'2'}];
    
    
    */
	 $scope.paymentMode = {paymentModeValue:'1'};
	 console.log('Selected Payment Mode'+$scope.paymentMode);
    
    //$scope.paymentModeModel = {getName:'',getValue:''};
    //console.log('selected value'+$scope.paymentModeModel.getValue);
	$scope.close = function () {
		
		
		
		
		
		//$uibModalInstance.dismiss('cancel');
		
		
		 if (navigator.geolocation) {
		        navigator.geolocation.getCurrentPosition(function (position) {

		                mysrclat = position.coords.latitude; 
		                mysrclong = position.coords.longitude;
		                console.log(mysrclat);
		                console.log(mysrclong);
		                
		                var geocoder = new google.maps.Geocoder();
		                geocoder.geocode({ 'latLng': latlng }, function (results, status) {
		                    if (status == google.maps.GeocoderStatus.OK) {
		                        if (results[1]) {
		                            alert("Location: " + results[1].formatted_address);
		                        }
		                    }
		                });
		        });
		        
		    }
		};
		
		$scope.addUserDeliveryAddress=function(paymentMode){
			console.log('paymentMode====>>>'+paymentMode.paymentModeValue);
			
			$scope.user.paymentMode=paymentMode.paymentModeValue;
			
			$uibModalInstance.close($scope.user);
		}
		

}])