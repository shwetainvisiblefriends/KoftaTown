mainApp.controller('LoginCtrl',['$scope','$state','loginService',function($scope,$state,loginService) {
	console.log("hallo login page");
	$scope.user={useId:'', password:''}
	$scope.login=function(){
		console.log($scope.user);
		console.log('login method is called');
		loginService.loggedInUser($scope.user).then(
				function(d){
					window.sessionStorage.setItem('loggedInUserId',JSON.stringify(d));
					console.log(d);
					if(d.LOGGEDINUSER.userType=='USER'){
						$state.go('product');
					}
					if(d.LOGGEDINUSER.userType=='ADMIN'){
						$state.go('admin.addNewProduct');
					}
				},
				function(errResponse){
					
				}
		);
		
		
	};
}])