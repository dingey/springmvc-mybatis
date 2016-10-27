package com.di.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonExample {
    protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public PersonExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getOrderByClause() {
		return orderByClause;
	}

	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	public boolean isDistinct() {
		return distinct;
	}

	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andPersonIdIsNull() {
			addCriterion("person_id is null");
			return (Criteria) this;
		}

		public Criteria andPersonIdIsNotNull() {
			addCriterion("person_id is not null");
			return (Criteria) this;
		}

		public Criteria andPersonIdEqualTo(Integer value) {
			addCriterion("person_id =", value, "personId");
			return (Criteria) this;
		}

		public Criteria andPersonIdNotEqualTo(Integer value) {
			addCriterion("person_id <>", value, "personId");
			return (Criteria) this;
		}

		public Criteria andPersonIdGreaterThan(Integer value) {
			addCriterion("person_id >", value, "personId");
			return (Criteria) this;
		}

		public Criteria andPersonIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("person_id >=", value, "personId");
			return (Criteria) this;
		}

		public Criteria andPersonIdLessThan(Integer value) {
			addCriterion("person_id <", value, "personId");
			return (Criteria) this;
		}

		public Criteria andPersonIdLessThanOrEqualTo(Integer value) {
			addCriterion("person_id <=", value, "personId");
			return (Criteria) this;
		}

		public Criteria andPersonIdIn(List<Integer> values) {
			addCriterion("person_id in", values, "personId");
			return (Criteria) this;
		}

		public Criteria andPersonIdNotIn(List<Integer> values) {
			addCriterion("person_id not in", values, "personId");
			return (Criteria) this;
		}

		public Criteria andPersonIdBetween(Integer value1, Integer value2) {
			addCriterion("person_id between", value1, value2, "personId");
			return (Criteria) this;
		}

		public Criteria andPersonIdNotBetween(Integer value1, Integer value2) {
			addCriterion("person_id not between", value1, value2, "personId");
			return (Criteria) this;
		}

		public Criteria andPersonNameIsNull() {
			addCriterion("person_name is null");
			return (Criteria) this;
		}

		public Criteria andPersonNameIsNotNull() {
			addCriterion("person_name is not null");
			return (Criteria) this;
		}

		public Criteria andPersonNameEqualTo(String value) {
			addCriterion("person_name =", value, "personName");
			return (Criteria) this;
		}

		public Criteria andPersonNameNotEqualTo(String value) {
			addCriterion("person_name <>", value, "personName");
			return (Criteria) this;
		}

		public Criteria andPersonNameGreaterThan(String value) {
			addCriterion("person_name >", value, "personName");
			return (Criteria) this;
		}

		public Criteria andPersonNameGreaterThanOrEqualTo(String value) {
			addCriterion("person_name >=", value, "personName");
			return (Criteria) this;
		}

		public Criteria andPersonNameLessThan(String value) {
			addCriterion("person_name <", value, "personName");
			return (Criteria) this;
		}

		public Criteria andPersonNameLessThanOrEqualTo(String value) {
			addCriterion("person_name <=", value, "personName");
			return (Criteria) this;
		}

		public Criteria andPersonNameLike(String value) {
			addCriterion("person_name like", value, "personName");
			return (Criteria) this;
		}

		public Criteria andPersonNameNotLike(String value) {
			addCriterion("person_name not like", value, "personName");
			return (Criteria) this;
		}

		public Criteria andPersonNameIn(List<String> values) {
			addCriterion("person_name in", values, "personName");
			return (Criteria) this;
		}

		public Criteria andPersonNameNotIn(List<String> values) {
			addCriterion("person_name not in", values, "personName");
			return (Criteria) this;
		}

		public Criteria andPersonNameBetween(String value1, String value2) {
			addCriterion("person_name between", value1, value2, "personName");
			return (Criteria) this;
		}

		public Criteria andPersonNameNotBetween(String value1, String value2) {
			addCriterion("person_name not between", value1, value2, "personName");
			return (Criteria) this;
		}

		public Criteria andPersonAgeIsNull() {
			addCriterion("person_age is null");
			return (Criteria) this;
		}

		public Criteria andPersonAgeIsNotNull() {
			addCriterion("person_age is not null");
			return (Criteria) this;
		}

		public Criteria andPersonAgeEqualTo(Integer value) {
			addCriterion("person_age =", value, "personAge");
			return (Criteria) this;
		}

		public Criteria andPersonAgeNotEqualTo(Integer value) {
			addCriterion("person_age <>", value, "personAge");
			return (Criteria) this;
		}

		public Criteria andPersonAgeGreaterThan(Integer value) {
			addCriterion("person_age >", value, "personAge");
			return (Criteria) this;
		}

		public Criteria andPersonAgeGreaterThanOrEqualTo(Integer value) {
			addCriterion("person_age >=", value, "personAge");
			return (Criteria) this;
		}

		public Criteria andPersonAgeLessThan(Integer value) {
			addCriterion("person_age <", value, "personAge");
			return (Criteria) this;
		}

		public Criteria andPersonAgeLessThanOrEqualTo(Integer value) {
			addCriterion("person_age <=", value, "personAge");
			return (Criteria) this;
		}

		public Criteria andPersonAgeIn(List<Integer> values) {
			addCriterion("person_age in", values, "personAge");
			return (Criteria) this;
		}

		public Criteria andPersonAgeNotIn(List<Integer> values) {
			addCriterion("person_age not in", values, "personAge");
			return (Criteria) this;
		}

		public Criteria andPersonAgeBetween(Integer value1, Integer value2) {
			addCriterion("person_age between", value1, value2, "personAge");
			return (Criteria) this;
		}

		public Criteria andPersonAgeNotBetween(Integer value1, Integer value2) {
			addCriterion("person_age not between", value1, value2, "personAge");
			return (Criteria) this;
		}

		public Criteria andPersonSexIsNull() {
			addCriterion("person_sex is null");
			return (Criteria) this;
		}

		public Criteria andPersonSexIsNotNull() {
			addCriterion("person_sex is not null");
			return (Criteria) this;
		}

		public Criteria andPersonSexEqualTo(String value) {
			addCriterion("person_sex =", value, "personSex");
			return (Criteria) this;
		}

		public Criteria andPersonSexNotEqualTo(String value) {
			addCriterion("person_sex <>", value, "personSex");
			return (Criteria) this;
		}

		public Criteria andPersonSexGreaterThan(String value) {
			addCriterion("person_sex >", value, "personSex");
			return (Criteria) this;
		}

		public Criteria andPersonSexGreaterThanOrEqualTo(String value) {
			addCriterion("person_sex >=", value, "personSex");
			return (Criteria) this;
		}

		public Criteria andPersonSexLessThan(String value) {
			addCriterion("person_sex <", value, "personSex");
			return (Criteria) this;
		}

		public Criteria andPersonSexLessThanOrEqualTo(String value) {
			addCriterion("person_sex <=", value, "personSex");
			return (Criteria) this;
		}

		public Criteria andPersonSexLike(String value) {
			addCriterion("person_sex like", value, "personSex");
			return (Criteria) this;
		}

		public Criteria andPersonSexNotLike(String value) {
			addCriterion("person_sex not like", value, "personSex");
			return (Criteria) this;
		}

		public Criteria andPersonSexIn(List<String> values) {
			addCriterion("person_sex in", values, "personSex");
			return (Criteria) this;
		}

		public Criteria andPersonSexNotIn(List<String> values) {
			addCriterion("person_sex not in", values, "personSex");
			return (Criteria) this;
		}

		public Criteria andPersonSexBetween(String value1, String value2) {
			addCriterion("person_sex between", value1, value2, "personSex");
			return (Criteria) this;
		}

		public Criteria andPersonSexNotBetween(String value1, String value2) {
			addCriterion("person_sex not between", value1, value2, "personSex");
			return (Criteria) this;
		}

		public Criteria andBirthDateIsNull() {
			addCriterion("birth_date is null");
			return (Criteria) this;
		}

		public Criteria andBirthDateIsNotNull() {
			addCriterion("birth_date is not null");
			return (Criteria) this;
		}

		public Criteria andBirthDateEqualTo(Date value) {
			addCriterion("birth_date =", value, "birthDate");
			return (Criteria) this;
		}

		public Criteria andBirthDateNotEqualTo(Date value) {
			addCriterion("birth_date <>", value, "birthDate");
			return (Criteria) this;
		}

		public Criteria andBirthDateGreaterThan(Date value) {
			addCriterion("birth_date >", value, "birthDate");
			return (Criteria) this;
		}

		public Criteria andBirthDateGreaterThanOrEqualTo(Date value) {
			addCriterion("birth_date >=", value, "birthDate");
			return (Criteria) this;
		}

		public Criteria andBirthDateLessThan(Date value) {
			addCriterion("birth_date <", value, "birthDate");
			return (Criteria) this;
		}

		public Criteria andBirthDateLessThanOrEqualTo(Date value) {
			addCriterion("birth_date <=", value, "birthDate");
			return (Criteria) this;
		}

		public Criteria andBirthDateIn(List<Date> values) {
			addCriterion("birth_date in", values, "birthDate");
			return (Criteria) this;
		}

		public Criteria andBirthDateNotIn(List<Date> values) {
			addCriterion("birth_date not in", values, "birthDate");
			return (Criteria) this;
		}

		public Criteria andBirthDateBetween(Date value1, Date value2) {
			addCriterion("birth_date between", value1, value2, "birthDate");
			return (Criteria) this;
		}

		public Criteria andBirthDateNotBetween(Date value1, Date value2) {
			addCriterion("birth_date not between", value1, value2, "birthDate");
			return (Criteria) this;
		}

		public Criteria andProvinceIsNull() {
			addCriterion("province is null");
			return (Criteria) this;
		}

		public Criteria andProvinceIsNotNull() {
			addCriterion("province is not null");
			return (Criteria) this;
		}

		public Criteria andProvinceEqualTo(String value) {
			addCriterion("province =", value, "province");
			return (Criteria) this;
		}

		public Criteria andProvinceNotEqualTo(String value) {
			addCriterion("province <>", value, "province");
			return (Criteria) this;
		}

		public Criteria andProvinceGreaterThan(String value) {
			addCriterion("province >", value, "province");
			return (Criteria) this;
		}

		public Criteria andProvinceGreaterThanOrEqualTo(String value) {
			addCriterion("province >=", value, "province");
			return (Criteria) this;
		}

		public Criteria andProvinceLessThan(String value) {
			addCriterion("province <", value, "province");
			return (Criteria) this;
		}

		public Criteria andProvinceLessThanOrEqualTo(String value) {
			addCriterion("province <=", value, "province");
			return (Criteria) this;
		}

		public Criteria andProvinceLike(String value) {
			addCriterion("province like", value, "province");
			return (Criteria) this;
		}

		public Criteria andProvinceNotLike(String value) {
			addCriterion("province not like", value, "province");
			return (Criteria) this;
		}

		public Criteria andProvinceIn(List<String> values) {
			addCriterion("province in", values, "province");
			return (Criteria) this;
		}

		public Criteria andProvinceNotIn(List<String> values) {
			addCriterion("province not in", values, "province");
			return (Criteria) this;
		}

		public Criteria andProvinceBetween(String value1, String value2) {
			addCriterion("province between", value1, value2, "province");
			return (Criteria) this;
		}

		public Criteria andProvinceNotBetween(String value1, String value2) {
			addCriterion("province not between", value1, value2, "province");
			return (Criteria) this;
		}

		public Criteria andCityIsNull() {
			addCriterion("city is null");
			return (Criteria) this;
		}

		public Criteria andCityIsNotNull() {
			addCriterion("city is not null");
			return (Criteria) this;
		}

		public Criteria andCityEqualTo(String value) {
			addCriterion("city =", value, "city");
			return (Criteria) this;
		}

		public Criteria andCityNotEqualTo(String value) {
			addCriterion("city <>", value, "city");
			return (Criteria) this;
		}

		public Criteria andCityGreaterThan(String value) {
			addCriterion("city >", value, "city");
			return (Criteria) this;
		}

		public Criteria andCityGreaterThanOrEqualTo(String value) {
			addCriterion("city >=", value, "city");
			return (Criteria) this;
		}

		public Criteria andCityLessThan(String value) {
			addCriterion("city <", value, "city");
			return (Criteria) this;
		}

		public Criteria andCityLessThanOrEqualTo(String value) {
			addCriterion("city <=", value, "city");
			return (Criteria) this;
		}

		public Criteria andCityLike(String value) {
			addCriterion("city like", value, "city");
			return (Criteria) this;
		}

		public Criteria andCityNotLike(String value) {
			addCriterion("city not like", value, "city");
			return (Criteria) this;
		}

		public Criteria andCityIn(List<String> values) {
			addCriterion("city in", values, "city");
			return (Criteria) this;
		}

		public Criteria andCityNotIn(List<String> values) {
			addCriterion("city not in", values, "city");
			return (Criteria) this;
		}

		public Criteria andCityBetween(String value1, String value2) {
			addCriterion("city between", value1, value2, "city");
			return (Criteria) this;
		}

		public Criteria andCityNotBetween(String value1, String value2) {
			addCriterion("city not between", value1, value2, "city");
			return (Criteria) this;
		}

		public Criteria andRegionIsNull() {
			addCriterion("region is null");
			return (Criteria) this;
		}

		public Criteria andRegionIsNotNull() {
			addCriterion("region is not null");
			return (Criteria) this;
		}

		public Criteria andRegionEqualTo(String value) {
			addCriterion("region =", value, "region");
			return (Criteria) this;
		}

		public Criteria andRegionNotEqualTo(String value) {
			addCriterion("region <>", value, "region");
			return (Criteria) this;
		}

		public Criteria andRegionGreaterThan(String value) {
			addCriterion("region >", value, "region");
			return (Criteria) this;
		}

		public Criteria andRegionGreaterThanOrEqualTo(String value) {
			addCriterion("region >=", value, "region");
			return (Criteria) this;
		}

		public Criteria andRegionLessThan(String value) {
			addCriterion("region <", value, "region");
			return (Criteria) this;
		}

		public Criteria andRegionLessThanOrEqualTo(String value) {
			addCriterion("region <=", value, "region");
			return (Criteria) this;
		}

		public Criteria andRegionLike(String value) {
			addCriterion("region like", value, "region");
			return (Criteria) this;
		}

		public Criteria andRegionNotLike(String value) {
			addCriterion("region not like", value, "region");
			return (Criteria) this;
		}

		public Criteria andRegionIn(List<String> values) {
			addCriterion("region in", values, "region");
			return (Criteria) this;
		}

		public Criteria andRegionNotIn(List<String> values) {
			addCriterion("region not in", values, "region");
			return (Criteria) this;
		}

		public Criteria andRegionBetween(String value1, String value2) {
			addCriterion("region between", value1, value2, "region");
			return (Criteria) this;
		}

		public Criteria andRegionNotBetween(String value1, String value2) {
			addCriterion("region not between", value1, value2, "region");
			return (Criteria) this;
		}

		public Criteria andAddressIsNull() {
			addCriterion("address is null");
			return (Criteria) this;
		}

		public Criteria andAddressIsNotNull() {
			addCriterion("address is not null");
			return (Criteria) this;
		}

		public Criteria andAddressEqualTo(String value) {
			addCriterion("address =", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotEqualTo(String value) {
			addCriterion("address <>", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressGreaterThan(String value) {
			addCriterion("address >", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressGreaterThanOrEqualTo(String value) {
			addCriterion("address >=", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressLessThan(String value) {
			addCriterion("address <", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressLessThanOrEqualTo(String value) {
			addCriterion("address <=", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressLike(String value) {
			addCriterion("address like", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotLike(String value) {
			addCriterion("address not like", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressIn(List<String> values) {
			addCriterion("address in", values, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotIn(List<String> values) {
			addCriterion("address not in", values, "address");
			return (Criteria) this;
		}

		public Criteria andAddressBetween(String value1, String value2) {
			addCriterion("address between", value1, value2, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotBetween(String value1, String value2) {
			addCriterion("address not between", value1, value2, "address");
			return (Criteria) this;
		}

		public Criteria andMobilePhoneIsNull() {
			addCriterion("mobile_phone is null");
			return (Criteria) this;
		}

		public Criteria andMobilePhoneIsNotNull() {
			addCriterion("mobile_phone is not null");
			return (Criteria) this;
		}

		public Criteria andMobilePhoneEqualTo(String value) {
			addCriterion("mobile_phone =", value, "mobilePhone");
			return (Criteria) this;
		}

		public Criteria andMobilePhoneNotEqualTo(String value) {
			addCriterion("mobile_phone <>", value, "mobilePhone");
			return (Criteria) this;
		}

		public Criteria andMobilePhoneGreaterThan(String value) {
			addCriterion("mobile_phone >", value, "mobilePhone");
			return (Criteria) this;
		}

		public Criteria andMobilePhoneGreaterThanOrEqualTo(String value) {
			addCriterion("mobile_phone >=", value, "mobilePhone");
			return (Criteria) this;
		}

		public Criteria andMobilePhoneLessThan(String value) {
			addCriterion("mobile_phone <", value, "mobilePhone");
			return (Criteria) this;
		}

		public Criteria andMobilePhoneLessThanOrEqualTo(String value) {
			addCriterion("mobile_phone <=", value, "mobilePhone");
			return (Criteria) this;
		}

		public Criteria andMobilePhoneLike(String value) {
			addCriterion("mobile_phone like", value, "mobilePhone");
			return (Criteria) this;
		}

		public Criteria andMobilePhoneNotLike(String value) {
			addCriterion("mobile_phone not like", value, "mobilePhone");
			return (Criteria) this;
		}

		public Criteria andMobilePhoneIn(List<String> values) {
			addCriterion("mobile_phone in", values, "mobilePhone");
			return (Criteria) this;
		}

		public Criteria andMobilePhoneNotIn(List<String> values) {
			addCriterion("mobile_phone not in", values, "mobilePhone");
			return (Criteria) this;
		}

		public Criteria andMobilePhoneBetween(String value1, String value2) {
			addCriterion("mobile_phone between", value1, value2, "mobilePhone");
			return (Criteria) this;
		}

		public Criteria andMobilePhoneNotBetween(String value1, String value2) {
			addCriterion("mobile_phone not between", value1, value2, "mobilePhone");
			return (Criteria) this;
		}
	}

	public static class Criteria extends GeneratedCriteria {
		protected Criteria() {
			super();
		}
	}

	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PersonExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPersonIdIsNull() {
            addCriterion("person_id is null");
            return (Criteria) this;
        }

        public Criteria andPersonIdIsNotNull() {
            addCriterion("person_id is not null");
            return (Criteria) this;
        }

        public Criteria andPersonIdEqualTo(Integer value) {
            addCriterion("person_id =", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotEqualTo(Integer value) {
            addCriterion("person_id <>", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdGreaterThan(Integer value) {
            addCriterion("person_id >", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("person_id >=", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLessThan(Integer value) {
            addCriterion("person_id <", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLessThanOrEqualTo(Integer value) {
            addCriterion("person_id <=", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdIn(List<Integer> values) {
            addCriterion("person_id in", values, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotIn(List<Integer> values) {
            addCriterion("person_id not in", values, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdBetween(Integer value1, Integer value2) {
            addCriterion("person_id between", value1, value2, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("person_id not between", value1, value2, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonNameIsNull() {
            addCriterion("person_name is null");
            return (Criteria) this;
        }

        public Criteria andPersonNameIsNotNull() {
            addCriterion("person_name is not null");
            return (Criteria) this;
        }

        public Criteria andPersonNameEqualTo(String value) {
            addCriterion("person_name =", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotEqualTo(String value) {
            addCriterion("person_name <>", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameGreaterThan(String value) {
            addCriterion("person_name >", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("person_name >=", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLessThan(String value) {
            addCriterion("person_name <", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLessThanOrEqualTo(String value) {
            addCriterion("person_name <=", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLike(String value) {
            addCriterion("person_name like", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotLike(String value) {
            addCriterion("person_name not like", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameIn(List<String> values) {
            addCriterion("person_name in", values, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotIn(List<String> values) {
            addCriterion("person_name not in", values, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameBetween(String value1, String value2) {
            addCriterion("person_name between", value1, value2, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotBetween(String value1, String value2) {
            addCriterion("person_name not between", value1, value2, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonAgeIsNull() {
            addCriterion("person_age is null");
            return (Criteria) this;
        }

        public Criteria andPersonAgeIsNotNull() {
            addCriterion("person_age is not null");
            return (Criteria) this;
        }

        public Criteria andPersonAgeEqualTo(Integer value) {
            addCriterion("person_age =", value, "personAge");
            return (Criteria) this;
        }

        public Criteria andPersonAgeNotEqualTo(Integer value) {
            addCriterion("person_age <>", value, "personAge");
            return (Criteria) this;
        }

        public Criteria andPersonAgeGreaterThan(Integer value) {
            addCriterion("person_age >", value, "personAge");
            return (Criteria) this;
        }

        public Criteria andPersonAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("person_age >=", value, "personAge");
            return (Criteria) this;
        }

        public Criteria andPersonAgeLessThan(Integer value) {
            addCriterion("person_age <", value, "personAge");
            return (Criteria) this;
        }

        public Criteria andPersonAgeLessThanOrEqualTo(Integer value) {
            addCriterion("person_age <=", value, "personAge");
            return (Criteria) this;
        }

        public Criteria andPersonAgeIn(List<Integer> values) {
            addCriterion("person_age in", values, "personAge");
            return (Criteria) this;
        }

        public Criteria andPersonAgeNotIn(List<Integer> values) {
            addCriterion("person_age not in", values, "personAge");
            return (Criteria) this;
        }

        public Criteria andPersonAgeBetween(Integer value1, Integer value2) {
            addCriterion("person_age between", value1, value2, "personAge");
            return (Criteria) this;
        }

        public Criteria andPersonAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("person_age not between", value1, value2, "personAge");
            return (Criteria) this;
        }

        public Criteria andPersonSexIsNull() {
            addCriterion("person_sex is null");
            return (Criteria) this;
        }

        public Criteria andPersonSexIsNotNull() {
            addCriterion("person_sex is not null");
            return (Criteria) this;
        }

        public Criteria andPersonSexEqualTo(String value) {
            addCriterion("person_sex =", value, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexNotEqualTo(String value) {
            addCriterion("person_sex <>", value, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexGreaterThan(String value) {
            addCriterion("person_sex >", value, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexGreaterThanOrEqualTo(String value) {
            addCriterion("person_sex >=", value, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexLessThan(String value) {
            addCriterion("person_sex <", value, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexLessThanOrEqualTo(String value) {
            addCriterion("person_sex <=", value, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexLike(String value) {
            addCriterion("person_sex like", value, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexNotLike(String value) {
            addCriterion("person_sex not like", value, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexIn(List<String> values) {
            addCriterion("person_sex in", values, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexNotIn(List<String> values) {
            addCriterion("person_sex not in", values, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexBetween(String value1, String value2) {
            addCriterion("person_sex between", value1, value2, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexNotBetween(String value1, String value2) {
            addCriterion("person_sex not between", value1, value2, "personSex");
            return (Criteria) this;
        }

        public Criteria andBirthDateIsNull() {
            addCriterion("birth_date is null");
            return (Criteria) this;
        }

        public Criteria andBirthDateIsNotNull() {
            addCriterion("birth_date is not null");
            return (Criteria) this;
        }

        public Criteria andBirthDateEqualTo(Date value) {
            addCriterion("birth_date =", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotEqualTo(Date value) {
            addCriterion("birth_date <>", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateGreaterThan(Date value) {
            addCriterion("birth_date >", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateGreaterThanOrEqualTo(Date value) {
            addCriterion("birth_date >=", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateLessThan(Date value) {
            addCriterion("birth_date <", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateLessThanOrEqualTo(Date value) {
            addCriterion("birth_date <=", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateIn(List<Date> values) {
            addCriterion("birth_date in", values, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotIn(List<Date> values) {
            addCriterion("birth_date not in", values, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateBetween(Date value1, Date value2) {
            addCriterion("birth_date between", value1, value2, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotBetween(Date value1, Date value2) {
            addCriterion("birth_date not between", value1, value2, "birthDate");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("region like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("region not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("region not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNull() {
            addCriterion("mobile_phone is null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNotNull() {
            addCriterion("mobile_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneEqualTo(String value) {
            addCriterion("mobile_phone =", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotEqualTo(String value) {
            addCriterion("mobile_phone <>", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThan(String value) {
            addCriterion("mobile_phone >", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_phone >=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThan(String value) {
            addCriterion("mobile_phone <", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThanOrEqualTo(String value) {
            addCriterion("mobile_phone <=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLike(String value) {
            addCriterion("mobile_phone like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotLike(String value) {
            addCriterion("mobile_phone not like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIn(List<String> values) {
            addCriterion("mobile_phone in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotIn(List<String> values) {
            addCriterion("mobile_phone not in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneBetween(String value1, String value2) {
            addCriterion("mobile_phone between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotBetween(String value1, String value2) {
            addCriterion("mobile_phone not between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}