app.controller('registroCtrl', function ($scope, registroService) {
	$scope.enviarRegistro = function () {
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