package def.errorhandler;

import def.express.express_lib_router_index.ErrorHandler;

/** This class holds all the global functions and variables of the def.modules.errorhandler package. */
public final class Globals {
    private Globals(){}
    @jsweet.lang.Module("errorhandler")
    native public static ErrorHandler errorhandler(def.errorhandler.errorhandler.Options options);
    @jsweet.lang.Module("errorhandler")
    native public static ErrorHandler errorhandler();
}

