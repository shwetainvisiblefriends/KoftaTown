'use strict';

var mainApp=angular.module('mainApp',['ui.router','ui.grid', 'ui.grid.autoResize','ui.bootstrap']);


mainApp.config(['$stateProvider','$urlRouterProvider',function($stateProvider, $urlRouterProvider) {
    
$urlRouterProvider.otherwise('/home');
    
    $stateProvider
        
        // HOME STATES AND NESTED VIEWS ========================================
        .state('home', {
            url: '/home',
            templateUrl: 'static/pages/home.html',
            controller:'HomeCtrl'
        })
        
       
      
        // ABOUT PAGE AND MULTIPLE NAMED VIEWS =================================
        .state('aboutUs', {
            url: '/about',
            templateUrl: 'static/pages/aboutUs.html'
           ,controller:'AboutUsCtrl'
            
        })
        
        
        
         .state('loginPage', {
        url: '/loginPage',
        templateUrl: 'static/pages/login.html'
        	,controller:'LoginCtrl'
        
    })
    
     .state('signUp', {
        url: '/signUp',
        templateUrl: 'static/pages/signUp.html'
        	,controller:'SignUpCtrl'
        
    })
    
    
    
    
     .state('product', {
        url: '/product',
        templateUrl: 'static/pages/productDetails.html'
        	,controller:'ProductDetailsCtrl'
        
    }) 
    
    .state('admin', {
        url: '/admin',
        templateUrl: 'static/pages/admin.html'
        	,controller:'AdminCtrl'
        
    }) 
    
    .state('admin.addNewProduct', {
            url: '/addNewProduct',
            templateUrl: 'static/pages/addNewProduct.html',
            	 controller:'AddNewProductCtrl'
            
        })
        .state('admin.createNewAdmin', {
            url: '/addNewProduct',
            templateUrl: 'static/pages/createNewAdmin.html',
            	 controller:'CreateNewAdminCtrl'
            
        })
        .state('admin.checkOrder', {
            url: '/checkOrder',
            templateUrl: 'static/pages/checkOrder.html',
            	 controller:'CheckOrderCtrl'
            
        })
        .state('admin.checkTotalSale', {
            url: '/checkTotalSale',
            templateUrl: 'static/pages/checkTotalSale.html',
            	 controller:'CheckTotalSaleCtrl'
            
        })
    
    /* .state('plans', {
        url: '/plans',
        templateUrl: 'static/pages/plans.html'
        
    })
    
    
    
  .state('termsAndConditions', {
        url: '/termsAndConditions',
        templateUrl: 'static/pages/termsAndConditions.html'
        
    })
      .state('whyUs', {
        url: '/whyUs',
        templateUrl: 'static/pages/whyUs.html'
        
    })
    .state('fAQ.html', {
        url: '/fAQ.html',
        templateUrl: 'static/pages/fAQ.html.html'
        
    })
    .state('contactUs', {
        url: '/contactUs',
        templateUrl: 'static/pages/contactUs.html'
        
    })
    
   
    
    
     .state('logout', {
       
        controller:'LogOutCtrl'
        
    })
    
     .state('dashboard', {
        url: '/dashboard',
        templateUrl: 'static/pages/dashboard.html'
        	,controller:'DashBoardCtrl'
        
    }) 
    
    
    .state('dashboard.profile', {
            url: '/profile',
            templateUrl: 'static/pages/profile.html',
            	 controller:'ProfileCtrl',
            	 resolve:{
            		 resa:function(){
            			 if(window.sessionStorage.getItem('loggedInUserId')===null){
            					$state.go('loginPage');
            					return
            				}	 
            		 }
            	 }
            	 
            
        })
    
        .state('dashboard.account', {
            url: '/account',
            templateUrl: 'static/pages/account.html',
            controller:'AccountCtrl'
            
        })
         .state('dashboard.downLine', {
            url: '/downline',
            templateUrl: 'static/pages/downLine.html',
            controller:'DownLineCtrl'
            
            
            
        })
         .state('dashboard.rewards', {
            url: '/rewards',
            templateUrl: 'static/pages/rewards.html',
            
        })
        
        .state('dashboard.todayTask', {
            url: '/todayTask',
            templateUrl: 'static/pages/todayTask.html',
            controller:'TodayTaskCtrl'
            
        })
        
        .state('dashboard.directReferralIncome', {
            url: '/directReferralIncome',
            templateUrl: 'static/pages/directReferral.html',
            controller:'DirectReferralCtrl'
            
        })
        
        .state('dashboard.binaryIncome', {
            url: '/binaryIncome',
            templateUrl: 'static/pages/binaryIncome.html',
            controller:'BinaryIncomeCtrl'
            
        })
        
        
        
        .state('dashboard.totatPayment', {
        url: '/totalPayment',
        templateUrl: 'static/pages/totalpayment.html'
        	,controller:'TotalpaymentCtrl'
        
    })*/
    ;
    
    
        
}]);


/*mainApp.controller('IndexCtrl', ['$scope','$state', function($scope,$state) {
	
	
}])
*/

