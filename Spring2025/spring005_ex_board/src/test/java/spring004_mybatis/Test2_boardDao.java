package spring004_mybatis;

import static org.junit.Assert.assertEquals;

import java.net.InetAddress;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.dao.BoardDao;
import com.company.dto.BoardDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/root-context.xml")
public class Test2_boardDao {

    @Resource
    private BoardDao dao;

    @Test
   // @Ignore
    public void testInsert() throws Exception {
        BoardDto dto = new BoardDto();
        dto.setBname("yooon");
        dto.setBpass("1234");
        dto.setBtitle("����");
        dto.setBcontent("����");

       
        InetAddress local = InetAddress.getLocalHost();
        String ip = local.getHostAddress();
        dto.setBip(ip);

        int result = dao.insert(dto);
        assertEquals(1, result);
        System.out.println(dao.insert(dto));
        System.out.println(dao.selectAll());
    }

    @Test
    @Ignore
    public void testSelectAll() {
        List<BoardDto> list = dao.selectAll();
        for (BoardDto dto : list) {
            System.out.println(dto.getBno() + ": " + dto.getBtitle());
        }
    }

    @Test
    @Ignore
    public void testSelectOne() {
        dao.updateBhit(1); // ��ȸ�� ����
        BoardDto dto = dao.selectOne(1);
        System.out.println("��ȸ�� ����: " + dto.getBtitle());
        System.out.println("��ȸ��: " + dto.getBhit());
    }

    @Test
    @Ignore
    public void testUpdate() {
        BoardDto dto = dao.selectOne(1);
        dto.setBtitle("������ ����");
        dto.setBcontent("������ ����");
        int result = dao.update(dto);
        assertEquals(1, result);
    }

    @Test
    @Ignore
    public void testDelete() {
        int result = dao.delete(1);
        assertEquals(1, result);
    }
}
