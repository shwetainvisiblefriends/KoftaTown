'use strict';

mainApp.factory('GetPathService', ['$http', '$q', function($http, $q){

	return {
		
			
		    getPathJson: function(){
     		    	
					return $http.get('/TheKoftaTown/static/JS/app/Utils/app.JSON')
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
		    },
		    
		 
		
	};
	
	

}]);