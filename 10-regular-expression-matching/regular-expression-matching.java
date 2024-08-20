class Solution {
    public boolean isMatch(String s, String p) {

       boolean[][] b = new boolean[s.length() + 1 ][p.length() + 1];
		
		int x = b.length - 1;
		int y = b[0].length -1;
		
		for(int i=0; i<=x; i++) {
			
			for(int j=0; j<=y; j++) {
				
				if(i == 0 && j == 0) {
					b[i][j] = true;
				}else if(i == 0) {
					char chp = p.charAt(j -1);
					
					if(chp == '*') {
						b[i][j] = b[i][j - 2];
					}else {
						b[i][j] = false;
					}
					
				}else if(j == 0) {
					b[i][j] = false;
				}else {
					char chp = p.charAt(j - 1);
					char chs = s.charAt(i - 1);
					
					if(chp == '*') {
						b[i][j] = b[i][j - 2];
						
						char chpm1 = p.charAt(j - 2);
						if(chpm1 == '.' || chpm1 == chs) {
							b[i][j] |= b[i - 1][j];
						}
						
					}else if(chp == '.') {
						b[i][j] = b[i - 1][j - 1];
					}else if(chp == chs) {
						b[i][j] = b[i - 1][j - 1];
					}else {
						b[i][j] = false;
					}
				}
			}
		}
		
		return b[x][y];
	}
}