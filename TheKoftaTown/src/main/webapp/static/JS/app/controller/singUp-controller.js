mainApp.controller('SignUpCtrl',['$scope','SignUpService',function($scope,SignUpService) {
	//console.log("hallo signUp  page");
	
	$scope.user={useId:'',password:'',userName:'',contactNumber:'',userType:''};
	
	$scope.newUser=function(typeofUser){
		alert(typeofUser);
		$scope.user.userType=typeofUser;
		console.log($scope.user);
		SignUpService.createUser($scope.user).then(function(d) {
			//console.log(d.baseUrl);
			
		},
		
		function(errResponse){});
		
	};
}])