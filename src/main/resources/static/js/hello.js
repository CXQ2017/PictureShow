angular.module('hello', [ 'ngRoute' ]).config(function($routeProvider, $httpProvider) {

	$routeProvider.when('/', {
		templateUrl : 'home.html',
		controller : 'home',
		controllerAs: 'controller'
	}).when('/login', {
		templateUrl : 'tagged_pdf.html',
		controller : 'tagged_pdf',
		controllerAs: 'controller'
	}).when("/contact",{
		templateUrl : 'contact.html',
		controller : 'contact',
		controllerAs:'controller',
	}).otherwise('/');

	$httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';

	//$httpProvider.default.headers.post = {
	//	'Content-Type': 'application/json'
	//}

}).controller('home', function($http, $rootScope) {
			var self = this;

		}).controller('tagged_pdf', function($http, $rootScope){

		}).controller('contact', function($http, $rootScope){

});

