package com.di.model;

import java.util.ArrayList;
import java.util.List;

public class ModuleExample {
    protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public ModuleExample() {
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

		public Criteria andModuleIdIsNull() {
			addCriterion("module_id is null");
			return (Criteria) this;
		}

		public Criteria andModuleIdIsNotNull() {
			addCriterion("module_id is not null");
			return (Criteria) this;
		}

		public Criteria andModuleIdEqualTo(Integer value) {
			addCriterion("module_id =", value, "moduleId");
			return (Criteria) this;
		}

		public Criteria andModuleIdNotEqualTo(Integer value) {
			addCriterion("module_id <>", value, "moduleId");
			return (Criteria) this;
		}

		public Criteria andModuleIdGreaterThan(Integer value) {
			addCriterion("module_id >", value, "moduleId");
			return (Criteria) this;
		}

		public Criteria andModuleIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("module_id >=", value, "moduleId");
			return (Criteria) this;
		}

		public Criteria andModuleIdLessThan(Integer value) {
			addCriterion("module_id <", value, "moduleId");
			return (Criteria) this;
		}

		public Criteria andModuleIdLessThanOrEqualTo(Integer value) {
			addCriterion("module_id <=", value, "moduleId");
			return (Criteria) this;
		}

		public Criteria andModuleIdIn(List<Integer> values) {
			addCriterion("module_id in", values, "moduleId");
			return (Criteria) this;
		}

		public Criteria andModuleIdNotIn(List<Integer> values) {
			addCriterion("module_id not in", values, "moduleId");
			return (Criteria) this;
		}

		public Criteria andModuleIdBetween(Integer value1, Integer value2) {
			addCriterion("module_id between", value1, value2, "moduleId");
			return (Criteria) this;
		}

		public Criteria andModuleIdNotBetween(Integer value1, Integer value2) {
			addCriterion("module_id not between", value1, value2, "moduleId");
			return (Criteria) this;
		}

		public Criteria andModuleCodeIsNull() {
			addCriterion("module_code is null");
			return (Criteria) this;
		}

		public Criteria andModuleCodeIsNotNull() {
			addCriterion("module_code is not null");
			return (Criteria) this;
		}

		public Criteria andModuleCodeEqualTo(String value) {
			addCriterion("module_code =", value, "moduleCode");
			return (Criteria) this;
		}

		public Criteria andModuleCodeNotEqualTo(String value) {
			addCriterion("module_code <>", value, "moduleCode");
			return (Criteria) this;
		}

		public Criteria andModuleCodeGreaterThan(String value) {
			addCriterion("module_code >", value, "moduleCode");
			return (Criteria) this;
		}

		public Criteria andModuleCodeGreaterThanOrEqualTo(String value) {
			addCriterion("module_code >=", value, "moduleCode");
			return (Criteria) this;
		}

		public Criteria andModuleCodeLessThan(String value) {
			addCriterion("module_code <", value, "moduleCode");
			return (Criteria) this;
		}

		public Criteria andModuleCodeLessThanOrEqualTo(String value) {
			addCriterion("module_code <=", value, "moduleCode");
			return (Criteria) this;
		}

		public Criteria andModuleCodeLike(String value) {
			addCriterion("module_code like", value, "moduleCode");
			return (Criteria) this;
		}

		public Criteria andModuleCodeNotLike(String value) {
			addCriterion("module_code not like", value, "moduleCode");
			return (Criteria) this;
		}

		public Criteria andModuleCodeIn(List<String> values) {
			addCriterion("module_code in", values, "moduleCode");
			return (Criteria) this;
		}

		public Criteria andModuleCodeNotIn(List<String> values) {
			addCriterion("module_code not in", values, "moduleCode");
			return (Criteria) this;
		}

		public Criteria andModuleCodeBetween(String value1, String value2) {
			addCriterion("module_code between", value1, value2, "moduleCode");
			return (Criteria) this;
		}

		public Criteria andModuleCodeNotBetween(String value1, String value2) {
			addCriterion("module_code not between", value1, value2, "moduleCode");
			return (Criteria) this;
		}

		public Criteria andModuleNameIsNull() {
			addCriterion("module_name is null");
			return (Criteria) this;
		}

		public Criteria andModuleNameIsNotNull() {
			addCriterion("module_name is not null");
			return (Criteria) this;
		}

		public Criteria andModuleNameEqualTo(String value) {
			addCriterion("module_name =", value, "moduleName");
			return (Criteria) this;
		}

		public Criteria andModuleNameNotEqualTo(String value) {
			addCriterion("module_name <>", value, "moduleName");
			return (Criteria) this;
		}

		public Criteria andModuleNameGreaterThan(String value) {
			addCriterion("module_name >", value, "moduleName");
			return (Criteria) this;
		}

		public Criteria andModuleNameGreaterThanOrEqualTo(String value) {
			addCriterion("module_name >=", value, "moduleName");
			return (Criteria) this;
		}

		public Criteria andModuleNameLessThan(String value) {
			addCriterion("module_name <", value, "moduleName");
			return (Criteria) this;
		}

		public Criteria andModuleNameLessThanOrEqualTo(String value) {
			addCriterion("module_name <=", value, "moduleName");
			return (Criteria) this;
		}

		public Criteria andModuleNameLike(String value) {
			addCriterion("module_name like", value, "moduleName");
			return (Criteria) this;
		}

		public Criteria andModuleNameNotLike(String value) {
			addCriterion("module_name not like", value, "moduleName");
			return (Criteria) this;
		}

		public Criteria andModuleNameIn(List<String> values) {
			addCriterion("module_name in", values, "moduleName");
			return (Criteria) this;
		}

		public Criteria andModuleNameNotIn(List<String> values) {
			addCriterion("module_name not in", values, "moduleName");
			return (Criteria) this;
		}

		public Criteria andModuleNameBetween(String value1, String value2) {
			addCriterion("module_name between", value1, value2, "moduleName");
			return (Criteria) this;
		}

		public Criteria andModuleNameNotBetween(String value1, String value2) {
			addCriterion("module_name not between", value1, value2, "moduleName");
			return (Criteria) this;
		}

		public Criteria andParentModuleIdIsNull() {
			addCriterion("parent_module_id is null");
			return (Criteria) this;
		}

		public Criteria andParentModuleIdIsNotNull() {
			addCriterion("parent_module_id is not null");
			return (Criteria) this;
		}

		public Criteria andParentModuleIdEqualTo(Integer value) {
			addCriterion("parent_module_id =", value, "parentModuleId");
			return (Criteria) this;
		}

		public Criteria andParentModuleIdNotEqualTo(Integer value) {
			addCriterion("parent_module_id <>", value, "parentModuleId");
			return (Criteria) this;
		}

		public Criteria andParentModuleIdGreaterThan(Integer value) {
			addCriterion("parent_module_id >", value, "parentModuleId");
			return (Criteria) this;
		}

		public Criteria andParentModuleIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("parent_module_id >=", value, "parentModuleId");
			return (Criteria) this;
		}

		public Criteria andParentModuleIdLessThan(Integer value) {
			addCriterion("parent_module_id <", value, "parentModuleId");
			return (Criteria) this;
		}

		public Criteria andParentModuleIdLessThanOrEqualTo(Integer value) {
			addCriterion("parent_module_id <=", value, "parentModuleId");
			return (Criteria) this;
		}

		public Criteria andParentModuleIdIn(List<Integer> values) {
			addCriterion("parent_module_id in", values, "parentModuleId");
			return (Criteria) this;
		}

		public Criteria andParentModuleIdNotIn(List<Integer> values) {
			addCriterion("parent_module_id not in", values, "parentModuleId");
			return (Criteria) this;
		}

		public Criteria andParentModuleIdBetween(Integer value1, Integer value2) {
			addCriterion("parent_module_id between", value1, value2, "parentModuleId");
			return (Criteria) this;
		}

		public Criteria andParentModuleIdNotBetween(Integer value1, Integer value2) {
			addCriterion("parent_module_id not between", value1, value2, "parentModuleId");
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

    public ModuleExample() {
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

        public Criteria andModuleIdIsNull() {
            addCriterion("module_id is null");
            return (Criteria) this;
        }

        public Criteria andModuleIdIsNotNull() {
            addCriterion("module_id is not null");
            return (Criteria) this;
        }

        public Criteria andModuleIdEqualTo(Integer value) {
            addCriterion("module_id =", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotEqualTo(Integer value) {
            addCriterion("module_id <>", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThan(Integer value) {
            addCriterion("module_id >", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("module_id >=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThan(Integer value) {
            addCriterion("module_id <", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThanOrEqualTo(Integer value) {
            addCriterion("module_id <=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdIn(List<Integer> values) {
            addCriterion("module_id in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotIn(List<Integer> values) {
            addCriterion("module_id not in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdBetween(Integer value1, Integer value2) {
            addCriterion("module_id between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("module_id not between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleCodeIsNull() {
            addCriterion("module_code is null");
            return (Criteria) this;
        }

        public Criteria andModuleCodeIsNotNull() {
            addCriterion("module_code is not null");
            return (Criteria) this;
        }

        public Criteria andModuleCodeEqualTo(String value) {
            addCriterion("module_code =", value, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeNotEqualTo(String value) {
            addCriterion("module_code <>", value, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeGreaterThan(String value) {
            addCriterion("module_code >", value, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("module_code >=", value, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeLessThan(String value) {
            addCriterion("module_code <", value, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeLessThanOrEqualTo(String value) {
            addCriterion("module_code <=", value, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeLike(String value) {
            addCriterion("module_code like", value, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeNotLike(String value) {
            addCriterion("module_code not like", value, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeIn(List<String> values) {
            addCriterion("module_code in", values, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeNotIn(List<String> values) {
            addCriterion("module_code not in", values, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeBetween(String value1, String value2) {
            addCriterion("module_code between", value1, value2, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeNotBetween(String value1, String value2) {
            addCriterion("module_code not between", value1, value2, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleNameIsNull() {
            addCriterion("module_name is null");
            return (Criteria) this;
        }

        public Criteria andModuleNameIsNotNull() {
            addCriterion("module_name is not null");
            return (Criteria) this;
        }

        public Criteria andModuleNameEqualTo(String value) {
            addCriterion("module_name =", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotEqualTo(String value) {
            addCriterion("module_name <>", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameGreaterThan(String value) {
            addCriterion("module_name >", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("module_name >=", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLessThan(String value) {
            addCriterion("module_name <", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLessThanOrEqualTo(String value) {
            addCriterion("module_name <=", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLike(String value) {
            addCriterion("module_name like", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotLike(String value) {
            addCriterion("module_name not like", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameIn(List<String> values) {
            addCriterion("module_name in", values, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotIn(List<String> values) {
            addCriterion("module_name not in", values, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameBetween(String value1, String value2) {
            addCriterion("module_name between", value1, value2, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotBetween(String value1, String value2) {
            addCriterion("module_name not between", value1, value2, "moduleName");
            return (Criteria) this;
        }

        public Criteria andParentModuleIdIsNull() {
            addCriterion("parent_module_id is null");
            return (Criteria) this;
        }

        public Criteria andParentModuleIdIsNotNull() {
            addCriterion("parent_module_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentModuleIdEqualTo(Integer value) {
            addCriterion("parent_module_id =", value, "parentModuleId");
            return (Criteria) this;
        }

        public Criteria andParentModuleIdNotEqualTo(Integer value) {
            addCriterion("parent_module_id <>", value, "parentModuleId");
            return (Criteria) this;
        }

        public Criteria andParentModuleIdGreaterThan(Integer value) {
            addCriterion("parent_module_id >", value, "parentModuleId");
            return (Criteria) this;
        }

        public Criteria andParentModuleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_module_id >=", value, "parentModuleId");
            return (Criteria) this;
        }

        public Criteria andParentModuleIdLessThan(Integer value) {
            addCriterion("parent_module_id <", value, "parentModuleId");
            return (Criteria) this;
        }

        public Criteria andParentModuleIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_module_id <=", value, "parentModuleId");
            return (Criteria) this;
        }

        public Criteria andParentModuleIdIn(List<Integer> values) {
            addCriterion("parent_module_id in", values, "parentModuleId");
            return (Criteria) this;
        }

        public Criteria andParentModuleIdNotIn(List<Integer> values) {
            addCriterion("parent_module_id not in", values, "parentModuleId");
            return (Criteria) this;
        }

        public Criteria andParentModuleIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_module_id between", value1, value2, "parentModuleId");
            return (Criteria) this;
        }

        public Criteria andParentModuleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_module_id not between", value1, value2, "parentModuleId");
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