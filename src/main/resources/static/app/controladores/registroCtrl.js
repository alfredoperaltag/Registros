app.controller('registroCtrl', function ($scope, registroService) {
	
	$scope.submitForm = function (esValido) {
		console.log("a");
        registroService.post().then((respuesta) => {
        	if (respuesta === true) {
                console.log("true");
            } else {
            	console.log("false");
            }
        }, (reject) => {
            console.log("Ctrl: ", reject);
        });
	}
	})