package decaf.error;

import decaf.Location;

/**
 * example：function 'gotoMars' expects 1 argument(s) but 3 given<br>
 * PA2
 */
public class BadCopyMatchError extends DecafError {
    
    private String firstType;

    private String secondType;

	public BadCopyMatchError(Location location, String firstType, String secondType) {
		super(location);
        this.firstType = firstType;
        this.secondType = secondType;
	}

	@Override
	protected String getErrMsg() {
		return "For copy expr, the source " + secondType + " and the destination " + firstType + " are not same";
	}
}
