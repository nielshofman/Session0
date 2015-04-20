package nl.utwente.di;

public class Quoter {

	public double getBookPrice(String string){
		int foo = Integer.parseInt(string);
		if (foo==1){
			return 10.0;
		}
		else{
			if(foo==2){
				return 45.0;
			}
			else{
				if(foo==3){
					return 20.0;
				}
				else{
					if(foo==4){
						return 35.0;
					}
					else{
						if(foo==5){
							return 50.0;
						}
						else{
							return 0;
						}
					}
				}
			}
		}
	}
}




