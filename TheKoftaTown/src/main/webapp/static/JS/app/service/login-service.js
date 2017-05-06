mainApp.factory('loginService', ['$http', '$q',function($http, $q){
	
	return {
		      loggedInUser:function(user){
		    	  return $http.post('http://localhost:8080/TheKoftaTown/v1/loginUserUser/',user)
					.then(
							function(response){
								console.log(response.data);
								return response.data;
							}, 
							function(errResponse){
								console.error('Error while creating user');
								return $q.reject(errResponse);
							}
					);
		    		
		      }
	
		  
		
		
		    }
}]);	