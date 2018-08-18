
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//第一部设置数据直线的关系
		//1、创建部门数据
		Dept d10 = new Dept(10,"财务部");
		Dept d20 = new Dept(20, "市场部");
		Dept d30 = new Dept(30, "技术部");
		//2、创建雇员数据
		Emp e7369 = new Emp(7369, "SMITH");
		Emp e7566 = new Emp(7566, "ALLEN");
		Emp e7902 = new Emp(7002, "FORD");
		Emp e7839 = new Emp(7839, "KING");
		Emp e7788 = new Emp(7788, "SCOTT");
		Emp e9999 = new Emp(9999,"xiaoWu");
		//3、创建角色信息
		Role r100 = new Role(100, "管理者");
		Role r200 = new Role(200, "职员层");
		Role r300 = new Role(300, "技术层");
		//4、创建权限数据
		Action a1000 = new Action(1000, "雇员入职", "emp:add");
		Action a2000 = new Action(2000, "雇员升职", "emp:edit");
		Action a3000 = new Action(3000, "放布公告", "news:add");
		Action a6000 = new Action(6000, "查看客户信息", "customer：Lists");
		Action a7000 = new Action(7000, "回访记录", "customer：add");
		//5、创建角色和权限的关系
		r100.setActions(new Action[] {a1000,a2000,a3000});
		r200.setActions(new Action[] {a7000,a6000});
		r300.setActions(new Action[] {a1000,a2000,a3000,a6000,a7000});
		//6、设置权限和角色的关系
		a1000.setRoles(new Role[] {r100,r300});
		a2000.setRoles(new Role[] {r100,r300});
		a3000.setRoles(new Role[] {r100,r300});
		a6000.setRoles(new Role[] {r200,r300});
		a7000.setRoles(new Role[] {r200,r300});
		//7、设置部门和角色关系
		d10.setRole(r100);
		d20.setRole(r200);
		d30.setRole(r300);
		//8、置角色和部门的关系
		r100.setDepts(new Dept[] {d10,d20,d30});
		r200.setDepts(new Dept[] {d20});
		r300.setDepts(new Dept[] {d30});
		//9、设置雇员和部门的关系
		e7369.setDept(d10);
		e7566.setDept(d10);
		e7788.setDept(d20);
		e7839.setDept(d20);
		e7902.setDept(d30);
		e9999.setDept(d30);
		//10、设置部门和雇员的关系
		d10.setEmps(new Emp[] {e7369,e7566});
		d20.setEmps(new Emp[] {e7788,e7839});
		d30.setEmps(new Emp[] {e7902,e9999});
		
		//第二部：取出相应数据
		System.out.println("1、根据员工找部门及其角色以及其对应的权限");
		System.out.println(e7369.getInfo());
		System.out.println("\t|-"+e7369.getDept().getInfo());
		System.out.println("\t\t|-e7369.getDept().getRole()");
		for (int i = 0; i < e7369.getDept().getRole().getActions().length; i++) {
			System.out.println("\t\t\t|- "+e7369.getDept().getRole().getActions()[i].getInfo());
		}
		System.out.println("----------------------------------------------");
		System.out.println("2、根据角色找到拥有该角色的所有部门，以及部门下所有员工");
		System.out.println(r100.getInfo());
		for (int i = 0; i < r100.getDepts().length; i++) {
			System.out.println("\t|-"+r100.getDepts()[i].getInfo());
			for (int j = 0; j < r100.getDepts()[i].getEmps().length; j++) {
				System.out.println("\t\t|-"+r100.getDepts()[i].getEmps()[j].getInfo());
			}
		}
		System.out.println("----------------------------------------------");
		System.out.println("根据权限找到拥有权限的所有角色以及拥有该角色的所有部门及其所有雇员");
		System.out.println(a1000.getInfo());
		for (int i = 0; i < a1000.getRoles().length; i++) {
			System.out.println("\t|-"+a1000.getRoles()[i].getInfo());
			for (int j = 0; j < a1000.getRoles()[i].getDepts().length; j++) {
				System.out.println("\t\t|-"+a1000.getRoles()[i].getDepts()[j].getInfo());
				for (int j2 = 0; j2 <a1000.getRoles()[i].getDepts()[j].getEmps().length; j2++) {
					System.out.println("\t\t\t|-"+a1000.getRoles()[i].getDepts()[j].getEmps()[j2].getInfo());
				}
			}
		}
		//System.out.println(r100.getDepts());
		
	}
		

}
