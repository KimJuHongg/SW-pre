 ** 판매 관리하는 프로그램을 상속과 다형성을 구현하여 작성하시오. (ArrayList로 구현)

** 고객 판매관리 **
1.고객 추가    2.상품판매        3. 조회      4.전체 회원 출력     5.삭제      6.종료

조회는 고객의 이름을 입력하면 보너스 포인트를 출력
삭제는 이름을 입력하면 삭제
상품 판매를 선택하면 고객의 이름, 상품 가격을 입력받아
고객이 지불할 금액(할인율 적용)과 누적된 자신의 보너스 포인트를 출력

고객 데이터 예시
  100, 이순신(silver)   200, 홍길동(gold)   300, 김유신(vip) - 매니저id는 임의로 설정  
 bonusRatio
silver : 0.1, gold : 0.2, vip : 0.5
bonusPoint = 물건가격*bonusRatio

 saleRatio (상품의 할인률)
silver : 없음, gold : 0.1, vip : 0.2

Customer 클래스
  protected int customerID;
  protected String customerName;
  protected String customerGrade;
   ...........
  initCustomer();  //이 메소드는 필요에 따라 선택. 생성자에서 설정하면 불필요
  int calcPrice(int price)
  String showCustomerInfo() : id, 이름, 등급, 보너스포인트 반환

SilverCustomer

GoldCustomer

VIPCustomer
  private int agentID;  //담당 매니저  
  int calcPrice(int price);
 */

package day0728;


public abstract class Customer
{
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;

	public Customer(int id, String name, String grade)
	{
		this.customerID = id;
		this.customerName = name;
		this.customerGrade = grade;
		this.bonusPoint = 0;
	}

	public abstract int calcPrice(int price);
	
	public String showCustomerInfo()
	{
		return customerID + ", " + customerName + "(" + customerGrade.toUpperCase() + ")";
	}
	
	public int getCustomerID()
	{
		return customerID;
	}

	public void setCustomerID(int customerID)
	{
		this.customerID = customerID;
	}

	public String getCustomerName()
	{
		return customerName;
	}

	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}

	public String getCustomerGrade()
	{
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade)
	{
		this.customerGrade = customerGrade;
	}
	
	public int getBonusPoint()
	{
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint)
	{
		this.bonusPoint = bonusPoint;
	}
}
