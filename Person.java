package lys;

public class Person {

	public String id; // ���

	public String name; // ����

	public String sex; // �Ա�

	public Integer age; // ����

	public String idType; // ֤������

	public String idNum; // ֤������

	public String tel; // ��ϵ�绰

	public String address; // ��ϵ��ַ
	
	public Person(){
		
	}

	public Person(String id,String name, String sex, Integer age) {
		this.id=id;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

    

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getIdNum() {
		return idNum;
	}

	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	
	

}