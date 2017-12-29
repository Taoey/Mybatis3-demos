package cn.hwtblog.bean;

public class SC {
	private String _s;
	private String _c;
	private String score;
	public SC() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SC(String _s, String _c, String score) {
		super();
		this._s = _s;
		this._c = _c;
		this.score = score;
	}
	public String get_s() {
		return _s;
	}
	public void set_s(String _s) {
		this._s = _s;
	}
	public String get_c() {
		return _c;
	}
	public void set_c(String _c) {
		this._c = _c;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "SC [_s=" + _s + ", _c=" + _c + ", score=" + score + "]";
	}
	

}
