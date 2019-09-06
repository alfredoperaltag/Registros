app.service ('registroService', function($q, factory) {
    const SELF = this;

    const PATH = 'registro';
    
    SELF.post = (registro) => {
        return $q((success, error) => {
            factory.post(PATH, registro).then(
                (resolve) => {
                    success(resolve)
                },
                (reject) => {
                    error(reject)
                })
        })

}
})