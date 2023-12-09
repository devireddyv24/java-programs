package arrays;

public class Dimension_3 {

	public static void main(String[] args) {
		int a[][][]= {{{1,2},{3,4}},{{1,2},{3,4}}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				for(int k=0;k<a[0][0].length;k++) {
					System.out.print(a[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
