package com.example.service.impl;

import com.example.entity.Book;
import com.example.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookServiceImplTest {
    @Resource
    private BookService bookService;

    @Test
    public void save() throws Exception {
        String[] names = {"独家记忆","余生多关照","绿物语","时光行者的你","林深时见鹿","单向迁徙"};
        String[] authors = {"木浮生","原城","镰足","桐华","宴生","张饮修"};
        String[] prices ={"23.8","24.3","26.2","28.5","20.6","33.6"};
        String[] introductions = {
                "世界上最美好的事情莫过于，我喜欢你的同时，刚好你也喜欢我。",
                "喜欢制造大悲或大喜的故事，从事自己热爱的职业，结识自己喜爱的人。",
                "不要被植物表面的柔软和温顺欺骗，有时，一缕委婉涌动的洁白，数年后会引发无法挽救的巨大灾难。",
                "他说：“后来，我遇见了一个将我的世界点亮的人。 他们都是时光里的伤心旅客，也是余生路上最好的旅伴。",
                "故事讲述了少年顾延树和少女鹿惜光幼年时曾相依相伴，却无奈被命运分离，从此分隔两地，各自在不同的环境中坚强而隐忍地长大，为了彼此成为更优秀的人。 两人从此经历了重重磨难和考验，当年被迫分开的真相也渐渐浮出水面。",
                "突围黑暗过往的自我救赎之作。回忆给自己，童话给读者。也许某一天，你终会耗尽一切，但，爱我，本身就是一场单向迁徙。"};

        String[] avatars = {
                "http://peojfj6k8.bkt.clouddn.com/1.jpg",
                "http://peojfj6k8.bkt.clouddn.com/2.jpg",
                "http://peojfj6k8.bkt.clouddn.com/3.jpg",
                "http://peojfj6k8.bkt.clouddn.com/4.jpg",
                "http://peojfj6k8.bkt.clouddn.com/5.jpg",
                "http://peojfj6k8.bkt.clouddn.com/6.jpg"};

        for (int i=0; i<6; i++){
            Book book = new Book();
            book.setName(names[i]);
            book.setAuthor(authors[i]);
            book.setAvatar(avatars[i]);
            book.setPrice(prices[i]);
            book.setIntroduction(introductions[i]);
            System.out.println(bookService.save(book));
        }
    }






    @Test
    public void getAll() throws Exception {

    }

    @Test
    public void get() throws Exception {

    }

    @Test
    public void delete() throws Exception {

    }

}