import javax.management.AttributeList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket ... tickets) {
        this.amount = amount;

        this.tickets.addAll(Arrays.asList(tickets));
    /*  - 배열을 새로 만드는 게 아니라, 원본 배열의 주소값을 참조한다
        - asList를 사용해서 내용을 수정하면 원본배열도 함께 바뀜
        - Arrays.asList()로 만든 List에 새로운 원소를 추가하거나 삭제는 할 수 없다.*/
    }

    public Ticket getTicket() {
        return tickets.remove(0);
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }







}
