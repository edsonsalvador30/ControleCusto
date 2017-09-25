package diagram.fornecedores;

import org.springframework.orm.jpa.*;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.*;
import org.springframework.transaction.*;
import org.springframework.transaction.annotation.*;
import org.springframework.core.io.*;
import org.springframework.data.repository.init.*;
import java.net.URL;
import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Classe que configura os beans para persistencia
 * @generated
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "diagram.fornecedores-EntityManagerFactory",
        transactionManagerRef = "diagram.fornecedores-TransactionManager"
)
class FornecedoresConfiguration {


    @Bean(name="diagram.fornecedores-EntityManagerFactory")
    public LocalEntityManagerFactoryBean entityManagerFactory() {
        LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
        factoryBean.setPersistenceUnitName("diagram.fornecedores");
        return factoryBean;
    }

    @Bean(name = "diagram.fornecedores-TransactionManager")
    public PlatformTransactionManager transactionManager() {
        return new JpaTransactionManager(entityManagerFactory().getObject());
    }

}