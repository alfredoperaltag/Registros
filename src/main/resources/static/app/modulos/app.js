const app = angular.module('appRegistro', ['ngRoute'])
	.config(['$routeProvider', function ($routeProvider) {

		$routeProvider
			.when("/", {
				templateUrl: "app/vistas/registro.html",
				controller: "registroCtrl"
			}).otherwise({
	            redirectTo: "/"
	        });
	}]);