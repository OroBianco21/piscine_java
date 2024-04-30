package day01.ex02;

public class UserIdsGenerator {
	
	private static UserIdsGenerator thing = null;
	private UserIdsGenerator(){}
	
	private int idGenerate = 0;
	
	public static UserIdsGenerator getInstance() {
		if (thing == null) {
            thing = new UserIdsGenerator();
        }
        return thing;
	}

	public int generateId() {
		return idGenerate++;
	}

    public int getIdgenerate() {
        return idGenerate;
    }
}
