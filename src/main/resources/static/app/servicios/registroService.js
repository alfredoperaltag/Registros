app.service ('registroService', function($q, factory) {
    const SELF = this;
    // nombre del restController
    const PATH = 'registro';
    
    SELF.post = () => {
        return $q((success, error) => {
            factory.post(PATH).then(
                (resolve) => {
                    success(resolve)
                },
                (reject) => {
                    error(reject)
                })
        })
    }
    
    // realizar conttrolador y terminar el REST
})