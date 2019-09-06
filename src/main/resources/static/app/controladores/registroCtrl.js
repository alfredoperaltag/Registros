app.controller('registroCtrl', function ($scope, registroService) {
	
	$scope.submitForm = function (esValido) {
        registroService.post($scope.registro).then((respuesta) => {
        	if (respuesta === true) {
        		 $scope.registro = {};
            } else {
            	console.log("error");
            }
        }, (reject) => {
            console.log("Ctrl: ", reject);
        });
	}
	})