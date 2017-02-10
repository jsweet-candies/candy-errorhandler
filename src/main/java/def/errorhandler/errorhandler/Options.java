package def.errorhandler.errorhandler;
@jsweet.lang.Interface
public abstract class Options extends def.js.Object {
    /**
         * Defaults to true.
         *
         * Possible values:
         *   true       : Log errors using console.error(str).
         *   false      : Only send the error back in the response.
         *   A function : pass the error to a function for handling.
         */
    public jsweet.util.union.Union<Boolean,LoggingCallback> log;
}

