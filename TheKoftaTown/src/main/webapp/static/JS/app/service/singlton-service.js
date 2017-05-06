mainApp.factory('getterSetter', function(){
var path =null;

return{
    setPath : function(currentPath){
        path = currentPath;
    },
    getPath: function() {
        return path;
    }
    //return path;
    
  }
})