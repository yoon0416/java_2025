//package spring004_mybatis;
//
//import static org.junit.Assert.assertEquals;
//
//import java.net.InetAddress;
//import java.util.List;
//
//import javax.annotation.Resource;
//
//import org.junit.Ignore;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.company.dao.BoardDao;
//import com.company.dto.BoardDto;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:config/root-context.xml")
//public class Test2_boardDao {
//
//    @Resource
//    private BoardDao dao;
//
//    @Test
//   // @Ignore
//    public void testInsert() throws Exception {
//        BoardDto dto = new BoardDto();
//        dto.setBname("0402");
//        dto.setBpass("1234");
//        dto.setBtitle("2번오류");
//        dto.setBcontent("고침");
//
//       
//        InetAddress local = InetAddress.getLocalHost();
//        String ip = local.getHostAddress();
//        dto.setBip(ip);
//
//        int result = dao.insert(dto);
//        assertEquals(1, result);
//        System.out.println(dao.selectAll());
//    }
//
//    @Test
//    @Ignore
//    public void testSelectAll() {
//        List<BoardDto> list = dao.selectAll();
//        for (BoardDto dto : list) {
//            System.out.println(dto.getBno() + ": " + dto.getBtitle());
//        }
//    }
//
//    @Test
//    @Ignore
//    public void testSelectOne() {
//        dao.updateBhit(1); // 조회수 증가
//        BoardDto dto = dao.selectOne(1);
//        System.out.println("조회된 제목: " + dto.getBtitle());
//        System.out.println("조회수: " + dto.getBhit());
//    }
//
//    @Test
//    @Ignore
//    public void testUpdate() {
//        BoardDto dto = dao.selectOne(1);
//        dto.setBtitle("수정된 제목");
//        dto.setBcontent("수정된 내용");
//        int result = dao.update(dto);
//        assertEquals(1, result);
//    }
//
//    @Test
//    @Ignore
//    public void testDelete() {
//        int result = dao.delete(1);
//        assertEquals(1, result);
//    }
//}
