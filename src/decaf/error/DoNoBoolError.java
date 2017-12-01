package decaf.error;

import decaf.Location;

/**
 * example：array subscript must be an integer<br>
 * PA2
 */
public class DoNoBoolError extends DecafError {
    private String type;

	public DoNoBoolError(Location location, String type) {
        super(location);
        this.type = type;
	}

	@Override
	protected String getErrMsg() {
		return "The condition of Do Stmt requestd type bool but " + type + " given";
	}

}
