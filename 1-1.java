class Datebase{
	String _sql;
	Datebase(String s){
		_sql=s;
	}
	void addSql(String s){
		_sql=_sql.concat("\n"+s);
	}
	void display(){
		System.out.println(_sql+";");
	}
	
	public static void main(String args[]){
		Datebase db=new Datebase("Select * from kokyaku");
		
		for(int i=0;i<args.length;i++){
			db._sql=db._sql+args[i]+"\n";
		}
		
		db.addSql("where kname '‹ã“VŽÐ'");
		db.addSql("group by adress");
		
		db.display();
	}
}
」
