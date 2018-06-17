package com.org.app.ctrl;

import java.util.List;
import javax.sql.DataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.org.app.mapper.MbeDao;
import com.org.app.vo.User;

@Controller
public class MainCtrl {
	@Autowired
	MbeDao mbeDao;

	//@RequestMapping(value="/index")
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	/**
     * SqlSessionFactory 설정
     */
    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource)throws Exception{
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
            sessionFactory.setDataSource(dataSource);
            Resource[] res = new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*Dao.xml");
            
            sessionFactory.setMapperLocations(res);
            return sessionFactory.getObject();
    }

    @RequestMapping(value="/user", method=RequestMethod.GET)
    @ResponseBody
    public List<User> getUserList(@RequestParam(value="user_id", required=false) String user_id) throws Exception {
    	User user = new User();
    	if (user_id != null && !user_id.equals("")) {
    		user.setUser_id(user_id);
    	}
    	return mbeDao.getUserList(user);
    }
}
