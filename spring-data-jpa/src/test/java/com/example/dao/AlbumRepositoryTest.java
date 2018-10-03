package com.example.dao;

import com.example.entity.Album;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlbumRepositoryTest {
    @Resource
    private AlbumResponsitory albumResponsitory ;
    @Test
    public void initData(){
        Album[] albums = {
                new Album("https://upload-images.jianshu.io/upload_images/1789560-78c572dfcf6d79ea?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240","最悲情的赌片《至尊无上2》，大反派英年早逝，小女孩退出演艺圈","提到赌片的话，大家会想到王晶、赌神周润发、赌圣周星驰、赌侠刘德华等，这些赌片大多都是喜剧收尾，不过有一部比较特殊，那就是《至尊无上之永霸天下》，...",88413),
                new Album("https://upload-images.jianshu.io/upload_images/323199-ee8ac2ea5f6bd51c.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240","推荐十部会改变你生活的电影","大学电影基础理论老师曾说，如果你想从事电影这一行，大学这四年，你至少要看一千部电影。如果算入国产烂片，我的观影数量应该已经达到这个规模了。 身边...",51613),
                new Album("https://upload-images.jianshu.io/upload_images/1789560-78c572dfcf6d79ea?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240","7部看完10分钟就舍不得去上厕所的高分电影","自po：长期维持每天一部电影的不看电影会死星人。入选标准：1.2005之后制作的相对较新的电影，在画面清晰度和数字化资源方面都相对有保障。2.豆...",12315),
                new Album("https://upload-images.jianshu.io/upload_images/1206743-2affa9dd40c42f9e.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240","坚持不下去了？这是最励志的电影清单","因为自己很拼，被身边的朋友冠以“鸡汤饮水机”的称号。 虽然不怎么会写鸡汤文，但是经常干点鸡汤事儿，比如我简介里提到的各种丧心病狂。 鸡汤文喝起来...",45122),
                new Album("https://upload-images.jianshu.io/upload_images/1856598-0fa5d62cfd377b7a.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240","自我成长：21部值得再看一遍的经典电影！","透过电影，我们的人生延长了三倍。 ——杨德昌 阅读、旅行、看电影是我觉得能让一个人快速提升自我的3种最佳方式。 尤其是...",11354),
                new Album("https://upload-images.jianshu.io/upload_images/4286313-5c9749ab36656a10.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240","每个迷茫的年轻人，都该去看看《无问西东》","被《无问西东》感动了。 不是因为它人物塑造得有多好，它讲故事的方式有多好，它的剪辑手法有多厉害。事实上有很多地方人物的动机不明确，讲故事的手法有...",23458)
        };
        for (int i = 0 ; i < 6 ; i ++){
            albumResponsitory.save(albums[i]) ;
        }
    }
    @Test
    public void findHotAlbums() {
        List<Album> albumList = albumResponsitory.findHotAlbums();
        albumList.forEach(album -> System.out.println(album));
    }
}