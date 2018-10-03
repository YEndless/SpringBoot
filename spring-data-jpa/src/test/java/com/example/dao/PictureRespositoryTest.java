package com.example.dao;

import com.example.entity.Picture;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest

public class PictureRespositoryTest {
    @Resource
    private PictureRespository pictureRespository ;

    @Test
    public void initData(){
        Picture[] pictures = {
                new Picture("https://upload-images.jianshu.io/upload_images/1789560-78c572dfcf6d79ea?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240","最悲情的赌片《至尊无上2》","提到赌片的话，大家会想到王晶、赌神周润发、赌圣周星驰、赌侠刘德华等",13),
                new Picture("https://upload-images.jianshu.io/upload_images/323199-ee8ac2ea5f6bd51c.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240","推荐十部会改变你生活的电影","大学电影基础理论老师曾说，如果你想从事电影这一行，大学这四年",513),
                new Picture("https://upload-images.jianshu.io/upload_images/1789560-78c572dfcf6d79ea?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240","7部看完10分钟就舍不得去上厕所的高分电影","自po：长期维持每天一部电影的不看电影会死星人。",125),
                new Picture("https://upload-images.jianshu.io/upload_images/1206743-2affa9dd40c42f9e.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240","坚持不下去了？这是最励志的电影清单","因为自己很拼，被身边的朋友冠以“鸡汤饮水机”的称号。",422),
                new Picture("https://upload-images.jianshu.io/upload_images/1856598-0fa5d62cfd377b7a.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240","自我成长：21部值得再看一遍的经典电影！","透过电影，我们的人生延长了三倍。",354),
                new Picture("https://upload-images.jianshu.io/upload_images/4286313-5c9749ab36656a10.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240","每个迷茫的年轻人，都该去看看《无问西东》","被《无问西东》感动了。 ",238)
        };
        for (int i = 0 ; i < 6 ; i ++){
            pictureRespository.save(pictures[i]) ;
        }
    }
    @Test
    public void findHotAlbums() {
        List<Picture> pictureList = pictureRespository.findAll();
        pictureList.forEach(picture -> System.out.println(picture));
    }

}