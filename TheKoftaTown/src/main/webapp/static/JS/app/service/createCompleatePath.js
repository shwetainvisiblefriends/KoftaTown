mainApp.factory('createPath',['GetPathService','getterSetter',function(GetPathService,getterSetter){
//var path;

return{
    
	createCompleateURL:function(relativeUrl){
		console.log(relativeUrl);
		GetPathService.getPathJson().then(
	  		function(d) {
	  			//console.log("hallo");
	  			console.log(relativeUrl);
				var path=d.baseUrl+d.relativeUrl;
				//return path;
				getterSetter.setPath(path);
				return ;
				
			},
			
			function(errResponse){
			
			}
	  		
	  	);
		
  },
}
}])