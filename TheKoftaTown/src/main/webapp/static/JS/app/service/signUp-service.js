mainApp.factory('SignUpService', ['$http', '$q','GetPathService' ,'createPath','getterSetter',function($http, $q,GetPathService,createPath,getterSetter){
	
	return {
		      createUser:function(user){
		    	  return $http.post('http://localhost:8080/TheKoftaTown/v1/RegisterUser/',user)
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
	
		   /* getPathJson: function(){
     		    	
					return $http.get('localhost:8080/TheKoftaTown/static/JS/app/Utils/path.JSON')
							.then(
									function(response){
										return response.data;
									}, 
									function(errResponse){
										console.error('Error while creating user');
										return $q.reject(errResponse);
									}
							);*/
		
		
		    }
}]);	    