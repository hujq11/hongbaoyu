package com.hujq.prize.job.annotation;

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface ElasticSimpleJob {

    @AliasFor("cron")
    String value() default "";

    @AliasFor("value") String cron() default "";

    String jobName() default "";

    int shardingTotalCount() default 1;

    public abstract String shardingItemParameters() default "";

    public abstract String jobParameter() default "";

    public abstract String dataSource() default "";

    public abstract String description() default "";

    public abstract boolean disabled() default false;

    public abstract boolean overwrite() default true;
}
