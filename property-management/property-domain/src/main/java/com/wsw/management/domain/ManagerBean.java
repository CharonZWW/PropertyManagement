package com.wsw.management.domain;

public class ManagerBean {

        private int m_id;
        private int m_role_id;
        private String m_username;
        private String m_password;

        public int getM_id() {
            return m_id;
        }

        public void setM_id(int m_id) {
            this.m_id = m_id;
        }

        public int getM_role_id() {
            return m_role_id;
        }

        public void setM_role_id(int m_role_id) {
            this.m_role_id = m_role_id;
        }

        public String getM_username() {
            return m_username;
        }

        public void setM_username(String m_username) {
            this.m_username = m_username;
        }

        public String getM_password() {
            return m_password;
        }

        public void setM_password(String m_password) {
            this.m_password = m_password;
        }

        @Override
        public String toString() {
            return "ManagersBean{" +
                    "m_id=" + m_id +
                    ", m_role_id=" + m_role_id +
                    ", m_username='" + m_username + '\'' +
                    ", m_password='" + m_password + '\'' +
                    '}';
        }

    }
