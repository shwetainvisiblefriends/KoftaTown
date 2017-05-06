mainApp.factory('GetAllProductService', ['$http', '$q',function($http, $q){
	
	return {
		      getAllProducts:function(){
		    	  return $http.get('http://localhost:8080/TheKoftaTown/v1/getAllProduct/')
					.then(
							function(response){
								console.log('get all products')
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