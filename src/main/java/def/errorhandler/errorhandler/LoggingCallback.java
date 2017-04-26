package def.errorhandler.errorhandler;
import def.express.express_lib_request.Request;
import def.express.express_lib_response.Response;

import def.js.Error;
public interface LoggingCallback {
    public void $apply(Error err, String str, Request req, Response res);
}

