mainApp.factory('addProductService', ['$http', '$q',function($http, $q){
	
	return {
		      addProduct:function(product,file){
		    	  
		    	  var fd = new FormData();
					fd.append('file', file);
		    	  return $http.post('http://localhost:8080/TheKoftaTown/v1/addProduct/',product)
					.then(
							function(response){
								
								console.log("in success block");
								
								
								
								$http.post('http://localhost:8080/TheKoftaTown/v1/uplodeProdutImg/?productId='+ response.data.ADDPRODUCT.id, fd, {

									transformRequest : angular.identity,
									headers : {
										'Content-Type' : undefined,
										'Process-Data' : false
									},

								}

						).then(function(response) {

							return response.data;
						}, function(errResponse) {
							console.error('Error while creating user');
							// console.log(errResponse);
							return $q.reject(errResponse);
						});
								
								
								//return response.data;
							}, 
							function(errResponse){
		
								
								console.error('Error while creating user');
								return $q.reject(errResponse);
							}
					);
		    		
		      }
	
		  
		
		
		    }
}]);	