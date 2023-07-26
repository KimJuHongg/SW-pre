/*1.배에는 3개의 의자가 있고 다리가 아픈 동물들이 순서대로 들어옴
2. 동물의 종류 : 무척추동물, 척추동물, 어류, 양서류, 파충류, 조류, 포유류
3. 동물들의 종이 같을 경우 무릎에 앉을 수 있다. 다 회복된 동물들은 언제들지 빠질 수 있음 무릎에 앉을 경우 1초로 카운트
4. 아무도 없거나 자리가 꽉차있을때 이 종이 들어올 경우 가장 오래 앉아있던 동물이 아닌 가장 최근에 같은 종이 한번도 들어오지 않은 종이 나가게 된다.
이때 자리를 청소하는데 1분이 걸림
 동물들이 아래와 같이 차례대로 들어왔을 때 전체 수행 시간(실행 시간)을 구해야한다.
여기서는 LRU알고리즘 사용, LRU알고리즘은 자리부재가 발생했을 경우 가장 오랫동안 사용되지 않은 자리를 제거하는 알고리즘
가장 최근에 들어오지 않은 친구를 생각하는 게 포인트!, ArrayList 사용	답 : 5분3초(303초)
*/

package day0725;

import java.util.ArrayList;
import java.util.List;

public class ex4 {
	
	   static ArrayList<String> chairs = new ArrayList<>(3);
	   static ArrayList<Integer> indexes = new ArrayList<>(3);
	   static int result;

	   public static void main(String[] args)
	   {
	      ArrayList<String> input = new ArrayList<>();
	      input.add("척추동물");
	      input.add("어류");
	      input.add("척추동물");
	      input.add("무척추동물");
	      input.add("파충류");
	      input.add("척추동물");
	      input.add("어류");
	      input.add("파충류");

	      LRU(input);
	      
	      if(result >= 60)
	         System.out.print(result / 60 + "분 ");
	      
	      if(result % 60 != 0)
	         System.out.println(result % 60 + "초");
	   }

	   public static void LRU(ArrayList<String> arr)
	   {
	      for (int i = 0; i < arr.size(); i++)
	      {
	         // 같은 동물이 앉아 있는 경우
	         if (chairs.contains(arr.get(i)))
	         {
	            // 같은 동물이 앉아 있는 인덱스를 indexes에서 삭제하고 다시 추가해서 최근에 앉은 자리로 설정
	            indexes.remove(indexes.indexOf(chairs.indexOf(arr.get(i))));
	            indexes.add(chairs.indexOf(arr.get(i)));
	            // 시간 1초 증가
	            result++;
	         }
	         // 같은 동물이 없는 경우
	         else
	         {
	            // 빈 자리가 있는 경우
	            if (chairs.size() < 3)
	            {
	               // 빈 자리에 앉히고 해당 인덱스를 indexes에 추가해서 최근에 앉은 자리로 설정
	               chairs.add(arr.get(i));
	               indexes.add(chairs.indexOf(arr.get(i)));
	               // 시간 60초 증가
	               result += 60;
	            }
	            // 빈 자리가 없는 경우
	            else
	            {
	               // 가장 앉은 지 오래된 자리를 temp에 대입하고 삭제
	               int temp = indexes.remove(0);
	               // 새로운 동물을 앉히고 해당 자리를 indexes에 추가해서 최근에 앉은 자리로 설정
	               chairs.set(temp, arr.get(i));
	               indexes.add(temp);
	               // 시간 60초 증가
	               result += 60;
	            }
	         }
	      }
	   }
	}
