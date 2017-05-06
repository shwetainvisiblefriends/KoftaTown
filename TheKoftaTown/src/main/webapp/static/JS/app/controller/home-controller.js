 
   mainApp.controller('HomeCtrl',['$scope','GetPathService',function($scope,GetPathService) {
	console.log("hallo home page");
	GetPathService.getPathJson().then(
			function(d) {
				console.log(d.baseUrl);
				
			},
			
			function(errResponse){}
			);
	//$scope.getCurrentLocation=function(){
		/*console.log('calling submit button..');
		
		GetUserLocationService.getUserCurrentLocation()
				.then(
						function(d) {
							console.log(d);
							
							
							
				              
							
						},
						
						function(errResponse){}
						);*/
		
	//};
}])