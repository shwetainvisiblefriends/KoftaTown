mainApp.controller('CheckOrderCtrl',['$scope','PlaceOredrService',function($scope,PlaceOredrService) {
	console.log("check New order new product ");
	
	$scope.gridOptions = {
			 columnDefs: [
			              {field: 'userName', displayName: 'Customer Name'},
			              {field:'deliveryAddress', displayName:'Customer Dilivery Address'},
			              {field: 'contactNumber', displayName: 'Customer contact Number'},
			              {field:'deliveryAddress', displayName:'Customer Dilivery Address'},
			              {field: 'paymentStatus', displayName: 'Payment status'},
			              {field:'paymentMode', displayName:'Payment Mode'},
			              {field:'orderStatus', displayName:' Order Status'}
			          ]
	};
	PlaceOredrService.getAllNewOrder('1').then(
			function(d){
				console.log(d);
				$scope.gridOptions.data=d.GETALLNEWORDER;
				console.log($scope.gridOptions.data)
			},
			function(errresponse) {
				});
	
			
	
}])