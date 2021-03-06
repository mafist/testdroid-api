package com.testdroid.api.model.jrjc;

import com.testdroid.api.APIEntity;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Damian Sniezek <damian.sniezek@bitbar.com>
 */
@XmlRootElement(name = "APIJiraPriority", namespace = "cloud.testdroid.api.model.jrjc")
@XmlType(name = "APIJiraPriority", namespace = "cloud.testdroid.api.model.jrjc")
public class APIJiraPriority extends APIEntity {

    private String name;

    public APIJiraPriority() {
    }

    public APIJiraPriority(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected <T extends APIEntity> void clone(T from) {
        cloneBase(from);
        APIJiraPriority jiraPriority = (APIJiraPriority) from;
        this.name = jiraPriority.name;
    }
}

