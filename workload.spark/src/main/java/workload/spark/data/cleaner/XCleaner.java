package workload.spark.data.cleaner;

public class XCleaner extends Cleaner{

	Cleaner cleaner;

	public XCleaner(Cleaner cleaner) {
		this.cleaner = cleaner;
	}

	@Override
	public void clean() throws Exception {
		this.cleaner.clean();
	}


}
