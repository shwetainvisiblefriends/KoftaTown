'use strict';

mainApp.factory('PlaceOredrService', ['$http', '$q', function($http, $q){

	return {
		
			
		setOrderDetails:function(orderDetails){
			return $http.post('http://localhost:8080/TheKoftaTown/v1/order/',orderDetails)
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
		getAllNewOrder:function(status){
			return $http.get('http://localhost:8080/TheKoftaTown/v1/getAllNewOrder?status='+status).then(
			function(response) {
				return response.data;
			}	,
			function(errResponse){
				return $q.reject(errResponse);
			}
			)
		}
	};
	
	

}]);