package c.e.g.exception;
import java.util.logging.Logger;

@SuppressWarnings("serial")
public class GrimpExceptionHandler extends Exception{

	private static final Logger logger = Logger.getLogger(GrimpExceptionHandler.class.getName());
	
	public enum GrimpError {CIE, CNFE, FNPE, IAE, NPE, NSFE, JPE, NSFEV}
	
	public GrimpExceptionHandler() {
		super("Error occurred while grimp axis grid assembler working!!");
	}
	
	public GrimpExceptionHandler(GrimpError ge, Exception e) {
		
		super("Error occurred while grimp axis grid assembler working!!");
		
		if(ge.equals(GrimpError.NPE)) {
			logger.warning("Annotation setting not exist.");
			logger.warning("Reason : Did you really define the annotation in class in function package ?");
			logger.warning(e.getMessage());
			e.printStackTrace();
		} else if(ge.equals(GrimpError.NSFE)) {
			logger.warning("Target field is not exist.");
			logger.warning("Reason : Cannot find the target field the class in Function package.");
			e.printStackTrace();
		} else if(ge.equals(GrimpError.CNFE)) {
			logger.warning("Could not find Class in function Package or Failed to instance the class.");
			logger.warning("Reason : Check it out Class in Function package is exist and same class name with you choose.");
			logger.warning(e.getMessage());
			e.printStackTrace();	
		} else if(ge.equals(GrimpError.FNPE)) {
			logger.warning("Annotation setting not exist.");
			logger.warning("Reason : Did you really define the annotation in class in function package ?");
			logger.warning(e.getMessage());
			e.printStackTrace();
		} else if (ge.equals(GrimpError.CIE)) {
			logger.warning("Could not find Class in function Package or Failed to instance the class.");
			logger.warning("Reason : Check it out Class in Function package is exist and same class name with you choose.");
			logger.warning(e.getMessage());
			e.printStackTrace();	
		} else if(ge.equals(GrimpError.IAE)) {
			logger.warning("Not Well form Annotation and Definition variable.");
			logger.warning(e.getMessage());
			e.printStackTrace();	
		} else if(ge.equals(GrimpError.JPE)) {
			e.printStackTrace();	
		}
	}
}
