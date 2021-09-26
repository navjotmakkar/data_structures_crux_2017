package July16.Stacks;

public class DynamicStack extends StackClass {

	@Override
	public void push(int value) throws Exception {
		if (this.tos == this.data.length - 1) {
			int[] oa = this.data;
			data = new int[2 * oa.length];
			for (int i = 0; i < oa.length; i++) {
				this.data[i] = oa[i];
			}
		}
		super.push(value);
	}
}
