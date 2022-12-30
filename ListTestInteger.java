public class ListTestInteger extends ListTest<Integer>{
	static Integer i;
	@Override
	public Integer getParameterInstance() {
		//TODO add your implementation
		return ++i;
	}

}
